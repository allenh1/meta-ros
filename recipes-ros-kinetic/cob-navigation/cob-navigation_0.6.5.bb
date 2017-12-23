# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_navigation stack provides different navigation packages for ."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-linear-nav cob-map-accessibility-analysis cob-mapping-slam cob-navigation-config cob-navigation-global cob-navigation-local cob-navigation-slam"
SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/kinetic/cob_navigation/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "15c50a47bf10bfe080ccd64188499ce7"
SRC_URI[sha256sum] = "8da39d542ba5cf904276a0da0d1268fb79efcd432e05d38cc5c5c96ef28c3547"
S = "${WORKDIR}/cob_navigation-release-release-kinetic-cob_navigation-0.6.5-0"

inherit catkin
