# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Suite of packages supporing the avahi implementation of zeroconf for ros."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native zeroconf-avahi zeroconf-avahi-demos"
SRC_URI = "https://github.com/yujinrobot-release/zeroconf_avahi_suite-release/archive/release/kinetic/zeroconf_avahi_suite/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0d8b3ed7763e6b98ddb45496899de832"
SRC_URI[sha256sum] = "460d5396cb3eb449b8585046857c5751c3f32b208e38dca0eb77aa931a8e8b39"
S = "${WORKDIR}/zeroconf_avahi_suite-release-release-kinetic-zeroconf_avahi_suite-0.2.3-0"

inherit catkin
