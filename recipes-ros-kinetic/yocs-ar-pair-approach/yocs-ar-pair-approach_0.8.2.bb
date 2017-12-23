# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Search and approach behaviour, moving to a target in front of a pair of ar marke"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native dynamic-reconfigure geometry-msgs rospy std-msgs tf"
SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/kinetic/yocs_ar_pair_approach/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7484abc53e8a09f68347476d881ababa"
SRC_URI[sha256sum] = "4c12fa754a0ff4d956825fddcceafffb04f29a893c3706bd94bbe5740b3730bc"
S = "${WORKDIR}/yujin_ocs-release-release-kinetic-yocs_ar_pair_approach-0.8.2-0"

inherit catkin
