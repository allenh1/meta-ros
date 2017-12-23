# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a tool for setting and publishing joint state values for a"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-qt-binding rospy sensor-msgs"
SRC_URI = "https://github.com/ros-gbp/joint_state_publisher-release/archive/release/kinetic/joint_state_publisher/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8af1e8d377e4aedc4f482626a586b636"
SRC_URI[sha256sum] = "78f8d920bc8376228945885566493caf7eb864255da71f59d77a4683c807ed1a"
S = "${WORKDIR}/joint_state_publisher-release-release-kinetic-joint_state_publisher-1.12.12-0"

inherit catkin
