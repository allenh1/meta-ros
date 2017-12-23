# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Rocon test framework (i.e. multi-launch rostest framework)."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native rocon-console rocon-launch rocon-python-utils roslaunch rospy rostest rosunit"
SRC_URI = "https://github.com/yujinrobot-release/rocon_multimaster-release/archive/release/kinetic/rocon_test/0.8.1-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f4bc9bd11f21ea9658d7018666226c6d"
SRC_URI[sha256sum] = "63ef29e75e746b6e69e12d4883e563739c5d4c534fea2a5e065d2599e71b1c8f"
S = "${WORKDIR}/rocon_multimaster-release-release-kinetic-rocon_test-0.8.1-2"

inherit catkin
