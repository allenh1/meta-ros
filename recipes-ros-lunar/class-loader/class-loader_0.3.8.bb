# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The class_loader package is a ROS-independent package for loading plugins during"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin cmake-modules console-bridge libpoco-dev"
SRC_URI = "https://github.com/ros-gbp/class_loader-release/archive/release/lunar/class_loader/0.3.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "94d53465987bb86fba0e20a16cbad8ad"
SRC_URI[sha256sum] = "63a2c8926318e831e705aaa6430a341f4dc1dac69fef16653aa39c8d014ec270"
S = "${WORKDIR}/class_loader-release-release-lunar-class_loader-0.3.8-0"

inherit catkin
