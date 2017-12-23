# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rtt_dynamic_reconfigure package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure roscpp rtt-ros rtt-rosnode"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_dynamic_reconfigure/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cd2f382d322b331d88ae48dcd592f529"
SRC_URI[sha256sum] = "a78802b54ba63874baffcd130dc05b1b22f338ef0241aceb7658862a2c0be00f"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_dynamic_reconfigure-2.9.1-0"

inherit catkin
