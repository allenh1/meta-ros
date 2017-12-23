# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Maintains the ecl licenses and also provides an install      target for deployin"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=3;endline=3;md5=f895f13378d9b55d775a2405d35506fd"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/kinetic/ecl_license/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2dcbc6ce7f2374201fa92c1b43c5ca8b"
SRC_URI[sha256sum] = "5e5a1aa98eb6ba4c14991fda69811ce6e951848be8ff47745a5a8031e3cf0fd1"
S = "${WORKDIR}/ecl_tools-release-release-kinetic-ecl_license-0.61.6-0"

inherit catkin
