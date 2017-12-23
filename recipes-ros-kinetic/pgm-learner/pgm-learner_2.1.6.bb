# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Parameter/Structure Estimation and Inference for Bayesian Belief Network"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native message-generation message-runtime python-scipy rospy"
SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/kinetic/pgm_learner/2.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7e609769ec4421d9a7513da2b3aaf2bc"
SRC_URI[sha256sum] = "e94c14abcc97e24cff2e67468a893ec851842b7a249488fced1c1e4e3c7b56c9"
S = "${WORKDIR}/jsk_3rdparty-release-release-kinetic-pgm_learner-2.1.6-0"

inherit catkin
