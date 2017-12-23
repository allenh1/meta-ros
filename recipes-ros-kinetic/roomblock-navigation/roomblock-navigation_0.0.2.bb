# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The roomblock_navigation package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "amcl catkin-native fake-localization map-server move-base rviz"
SRC_URI = "https://github.com/tork-a/roomblock-release/archive/release/kinetic/roomblock_navigation/0.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "530cd768c33f9e2a432b20307ca5adcb"
SRC_URI[sha256sum] = "9df21260ee4811b03420bf45df2c69e4900b602d7fb8c471c4ab30681970acac"
S = "${WORKDIR}/roomblock-release-release-kinetic-roomblock_navigation-0.0.2-0"

inherit catkin
