# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides an rtt typekit for ROS controller_manager_msgs messages.      It allows"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-manager-msgs rtt-roscomm rtt-std-msgs"
SRC_URI = "https://github.com/orocos-gbp/rtt_ros_control-release/archive/release/kinetic/rtt_controller_manager_msgs/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "20d5649e87f1ba953b41ec333992cb52"
SRC_URI[sha256sum] = "36ecb84d9b805f9fb415ccb2e04be67b7f2056e46c40784ac989434051c38b7c"
S = "${WORKDIR}/rtt_ros_control-release-release-kinetic-rtt_controller_manager_msgs-0.1.1-0"

inherit catkin
