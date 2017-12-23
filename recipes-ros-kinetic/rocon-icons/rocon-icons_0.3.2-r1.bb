# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Icons for rocon."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-catkin-pkg-native"
SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/kinetic/rocon_icons/0.3.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f77a4a5d42585b389f19949acfa4e196"
SRC_URI[sha256sum] = "82f1982ca80bfa25bf41eeccd556449b9adceb2ebd9045c910ab1526328424f2"
S = "${WORKDIR}/rocon_tools-release-release-kinetic-rocon_icons-0.3.2-1"

inherit catkin
