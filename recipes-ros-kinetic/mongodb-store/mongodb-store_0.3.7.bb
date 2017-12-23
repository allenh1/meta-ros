# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package to support MongoDB-based storage and analysis for data from a ROS syst"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native geometry-msgs libmongocxx-ros libssl-dev message-generation mongodb mongodb-store-msgs python-catkin-pkg-native python-pymongo roscpp rospy rostest std-msgs std-srvs topic-tools"
SRC_URI = "https://github.com/strands-project-releases/mongodb_store/archive/release/kinetic/mongodb_store/0.3.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a16bfea6d766996ed7181f5ae8952bf3"
SRC_URI[sha256sum] = "93e5af8df7c8dac4e002d817e157b51059949fd5c212e4f6b1dd02334ecf0a84"
S = "${WORKDIR}/mongodb_store-release-kinetic-mongodb_store-0.3.7-0"

inherit catkin
