# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Command line python console utilities (mostly for colourisation)."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-catkin-pkg-native"
SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/kinetic/rocon_console/0.3.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1598844409c12f89bfdfd2e58c4fe68b"
SRC_URI[sha256sum] = "69f9fea0fa54cf97c6e6c98ba7891ee87a02e3fe98a295612bdf5920865e86c5"
S = "${WORKDIR}/rocon_tools-release-release-kinetic-rocon_console-0.3.2-1"

inherit catkin
