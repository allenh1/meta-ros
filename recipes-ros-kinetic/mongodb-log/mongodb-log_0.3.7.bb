# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The mongodb_log package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "catkin-native libmongocxx-ros libssl-dev mongodb-store python-pymongo rosgraph roslib rospy rostopic sensor-msgs tf"
SRC_URI = "https://github.com/strands-project-releases/mongodb_store/archive/release/kinetic/mongodb_log/0.3.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7f4097a1a6c644013582932fbb3bdb75"
SRC_URI[sha256sum] = "3f61c4a375320a672e05db223268414f78762c3a1b77a6f7651d41cddbe2348b"
S = "${WORKDIR}/mongodb_store-release-kinetic-mongodb_log-0.3.7-0"

inherit catkin
