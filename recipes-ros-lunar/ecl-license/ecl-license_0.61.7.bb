# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Maintains the ecl licenses and also provides an install      target for deployin"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=3;endline=3;md5=f895f13378d9b55d775a2405d35506fd"

DEPENDS = "catkin"
SRC_URI = "https://github.com/yujinrobot-release/ecl_tools-release/archive/release/lunar/ecl_license/0.61.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e5d5e2a7ffd1818dfd78a8db16a6aa72"
SRC_URI[sha256sum] = "6eebca3d06322807025ca4e20c61960ce3eb1aa1e0786081eb5b568ce1e05347"
S = "${WORKDIR}/ecl_tools-release-release-lunar-ecl_license-0.61.7-0"

inherit catkin
