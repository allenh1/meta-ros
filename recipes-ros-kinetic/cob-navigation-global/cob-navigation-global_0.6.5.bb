# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package holds config and launch files for running the   node on the .     T"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "amcl catkin-native cob-default-env-config cob-linear-nav cob-navigation-config cob-scan-unifier dwa-local-planner map-server move-base rviz topic-tools"
SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/kinetic/cob_navigation_global/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9089136af8bce530540c70c8b3cb04ff"
SRC_URI[sha256sum] = "d4826c2849a2db2205a80ff218b3c62a8c05e1f38359edb2acb5bee3754cc99a"
S = "${WORKDIR}/cob_navigation-release-release-kinetic-cob_navigation_global-0.6.5-0"

inherit catkin
