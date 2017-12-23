# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The pythonwifi package is available through pypi, but not through a      deb pac"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "catkin-native python-catkin-pkg-native"
SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/kinetic/rocon_python_wifi/0.3.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f9ad280abc284cc9084f9e6982e24254"
SRC_URI[sha256sum] = "2ec60de42401432db69b67247a38ae52eff9fc7a3814ee6e00eb26c66cc797d6"
S = "${WORKDIR}/rocon_tools-release-release-kinetic-rocon_python_wifi-0.3.2-1"

inherit catkin
