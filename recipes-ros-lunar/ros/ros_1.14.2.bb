# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS packaging system"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native mk rosbash rosboost-cfg rosbuild rosclean roscreate roslang roslib rosmake rosunit"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/ros/1.14.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d17479e03c18f792f44d4a4f0bc5fe15"
SRC_URI[sha256sum] = "78f209b97bf15b76b097ba0f9f515ee491f8b1670100c6bfa80aba5f0e3b4901"
S = "${WORKDIR}/ros-release-release-lunar-ros-1.14.2-0"

inherit catkin
