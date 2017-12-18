# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "polled_camera contains a service and C++ helper classes for implementing a polle"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin image-transport message-generation message-runtime roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/lunar/polled_camera/1.11.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9e67ea067a44f4cf1d41a166894311d1"
SRC_URI[sha256sum] = "5da5d907214530c0126171b13a9cfc6aaf550ab11969597bc9f26916dbfa0398"
S = "${WORKDIR}/image_common-release-release-lunar-polled_camera-1.11.13-0"

inherit catkin
