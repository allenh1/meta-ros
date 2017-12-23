# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rqt_controller_manager package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-manager rqt-gui"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/kinetic/rqt_controller_manager/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "094bdb7a153ccea03d405d0a96f7bf21"
SRC_URI[sha256sum] = "110b93148f2d53b0d322cdb810071cd2609558e14d9bff059f44dd37f44f3e71"
S = "${WORKDIR}/ros_control-release-release-kinetic-rqt_controller_manager-0.13.0-0"

inherit catkin
