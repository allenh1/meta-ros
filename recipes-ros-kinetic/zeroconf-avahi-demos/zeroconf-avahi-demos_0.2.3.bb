# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Several demos and launch-tests for the avahi based zero-configuration."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "avahi-daemon catkin-native zeroconf-avahi"
SRC_URI = "https://github.com/yujinrobot-release/zeroconf_avahi_suite-release/archive/release/kinetic/zeroconf_avahi_demos/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "924224f16cdfb64a03e6c75554e9ad6a"
SRC_URI[sha256sum] = "455fcbd44c676d4f8927b48a783b53ddd14aea5473b7a907b411ac91bb497000"
S = "${WORKDIR}/zeroconf_avahi_suite-release-release-kinetic-zeroconf_avahi_demos-0.2.3-0"

inherit catkin
