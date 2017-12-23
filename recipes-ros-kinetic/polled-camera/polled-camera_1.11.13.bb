# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "polled_camera contains a service and C++ helper classes for implementing a polle"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native image-transport message-generation message-runtime roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/kinetic/polled_camera/1.11.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c19a3b434bc9926a13a7079132ee4fb4"
SRC_URI[sha256sum] = "4c30bb506474e7c9c0d2d4676d48ca86bdaae3bc5d223420db610d2163a2fbfa"
S = "${WORKDIR}/image_common-release-release-kinetic-polled_camera-1.11.13-0"

inherit catkin
