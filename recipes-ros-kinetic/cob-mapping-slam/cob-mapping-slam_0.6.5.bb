# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "cob_mapping_slam holds launch files for running SLAM using the  package."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "catkin-native cob-navigation-global gmapping"
SRC_URI = "https://github.com/ipa320/cob_navigation-release/archive/release/kinetic/cob_mapping_slam/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "66aae508e90bea3f97783649e22c152a"
SRC_URI[sha256sum] = "9beeeeffb11ba8b192ce45320a0d576173b1ddc35427e850efed2e7ade1677f9"
S = "${WORKDIR}/cob_navigation-release-release-kinetic-cob_mapping_slam-0.6.5-0"

inherit catkin
