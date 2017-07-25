# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "polled_camera contains a service and C++ helper classes for implementing a polle"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native image-transport message-generation message-runtime roscpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/lunar/polled_camera/1.11.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b0ac1d27c88a7c2aac46872264686075"
SRC_URI[sha256sum] = "4ed667862ddf0cb96a887fa84d1bd33b9d71ae581f31a4f75417a35127e5274d"
S = "${WORKDIR}/image_common-release-release-lunar-polled_camera-1.11.12-0"

inherit catkin
