# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a tool for setting and publishing joint state values for a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-qt-binding rospy sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/joint_state_publisher-release/archive/release/lunar/joint_state_publisher/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5e9529e78ad26ecf71b6a7410322a5b7"
SRC_URI[sha256sum] = "1d95e4acd165723ad4f698a76115c966d2e9baf716908bf5c2638510f163bdb9"
S = "${WORKDIR}/joint_state_publisher-release-release-lunar-joint_state_publisher-1.12.12-0"

inherit catkin
