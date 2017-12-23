# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "assimp-devel bayesian-belief-networks catkin-native downward ff ffha julius julius-ros libcmt libsiftfast mini-maxwell nlopt opt-camera pgm-learner rospatlite rosping slic voice-text"
SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/kinetic/jsk_3rdparty/2.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7c626b7e99bb7cdabe7ad759821c0e18"
SRC_URI[sha256sum] = "d77f4a73c1ed7c2987cb5b6294815c18cecb5c38e2fb5514f85493ba0e3a95ac"
S = "${WORKDIR}/jsk_3rdparty-release-release-kinetic-jsk_3rdparty-2.1.6-0"

inherit catkin
