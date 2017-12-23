# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=28;endline=28;md5=c93e37fc0c6f510db5735eb91dcc1550"

DEPENDS = "abb-driver abb-resources catkin-native joint-state-publisher robot-state-publisher roslaunch rviz"
SRC_URI = "https://github.com/ros-industrial-release/abb-release/archive/release/kinetic/abb_irb5400_support/1.3.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "44439303e0ae96af5b35dd24c6ea8dab"
SRC_URI[sha256sum] = "a510749f6ad072d9eb120978f8a78ca37bca1eba3f87dbd5fb0b22f1c700a971"
S = "${WORKDIR}/abb-release-release-kinetic-abb_irb5400_support-1.3.0-1"

inherit catkin
