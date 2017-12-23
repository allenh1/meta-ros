# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides launch files for running   with the   slam package of ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-mapping-slam cob-navigation-config cob-navigation-global rviz"
SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/kinetic/cob_navigation_slam/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3e63ee109c0f530369b1a37b89b3f6aa"
SRC_URI[sha256sum] = "723a6ae3a7070f94fbf06516263ca5fe21cef9cf54a1b323d4fee8454f2ed50f"
S = "${WORKDIR}/cob_navigation-release-release-kinetic-cob_navigation_slam-0.6.5-0"

inherit catkin
