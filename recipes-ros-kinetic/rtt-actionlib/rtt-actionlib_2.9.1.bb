# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rtt_actionlib package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native roscpp rtt-actionlib-msgs rtt-ros rtt-rosclock rtt-roscomm"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_integration-release/archive/release/kinetic/rtt_actionlib/2.9.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8de0e00e9842107525493b97b9fb962b"
SRC_URI[sha256sum] = "efa5c44dbfa36a704a046c9c2d9012b3aefb1c0c727515bc0ec89be86ab83961"
S = "${WORKDIR}/rtt_ros_integration-release-release-kinetic-rtt_actionlib-2.9.1-0"

inherit catkin
