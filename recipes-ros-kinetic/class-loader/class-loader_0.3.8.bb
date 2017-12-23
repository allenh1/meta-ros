# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The class_loader package is a ROS-independent package for loading plugins during"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cmake-modules console-bridge libpoco-dev"
SRC_URI = "https://github.com/ros-gbp/class_loader-release/archive/release/kinetic/class_loader/0.3.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "75ea80b5b06e8d91a3c46d0f53d23097"
SRC_URI[sha256sum] = "9a645d1442f6cdab1e0e53229fdc5ea0db933a7bf7cd8ff9690e6ba58511e960"
S = "${WORKDIR}/class_loader-release-release-kinetic-class_loader-0.3.8-0"

inherit catkin
