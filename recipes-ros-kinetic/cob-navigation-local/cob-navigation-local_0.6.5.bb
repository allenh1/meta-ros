# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package holds config and launch files for running the   node on the  in an "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-navigation-config dwa-local-planner move-base rviz"
SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/kinetic/cob_navigation_local/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d9334e089a116dd7c7b3ef3ac238437e"
SRC_URI[sha256sum] = "908dbda00d0bb5b5670f7c29fb8ffce89c1be936661e91e252974b82c47d886f"
S = "${WORKDIR}/cob_navigation-release-release-kinetic-cob_navigation_local-0.6.5-0"

inherit catkin
