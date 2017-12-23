# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Launch files to open an OpenNI device and load all nodelets to       convert raw"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nodelet openni-camera rgbd-launch roslaunch"
SRC_URI = "https://github.com/ros-gbp/openni_launch-release/archive/release/kinetic/openni_launch/1.9.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "aae8718f4c666abcbc8710204f3e6765"
SRC_URI[sha256sum] = "d94588158da85c2052e5bb6bbea4aa37bce1faedba42dab149dd7d889864ba43"
S = "${WORKDIR}/openni_launch-release-release-kinetic-openni_launch-1.9.8-0"

inherit catkin
