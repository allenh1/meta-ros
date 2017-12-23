# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rqt_controller_manager package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-manager rqt-gui"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/rqt_controller_manager/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3c32dc416860c6f3ef195ab955bb5dea"
SRC_URI[sha256sum] = "bf75221e75f20bf025c5fc6e620ee823cd4d0675d8e6060b64654d5cf300da14"
S = "${WORKDIR}/ros_control-release-release-lunar-rqt_controller_manager-0.13.0-0"

inherit catkin
