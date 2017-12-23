# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A wrapper for the libmongocxx for mongodb_store"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-1.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "boost ca-certificates catkin-native git libssl-dev roscpp scons"
SRC_URI = "https://github.com/strands-project-releases/mongodb_store/archive/release/kinetic/libmongocxx_ros/0.3.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "976e3addc7cf5fc2ff671a53e3e5a419"
SRC_URI[sha256sum] = "f937b6a11f090430189ea880d173a81544e7c2c80a2aa35f763071d2a34feaa5"
S = "${WORKDIR}/mongodb_store-release-kinetic-libmongocxx_ros-0.3.7-0"

inherit catkin
