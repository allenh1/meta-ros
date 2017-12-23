# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Filters a laser scan to remove points that are in the current static map"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native laser-filters nav-msgs roslib rospy sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/wu-robotics/laser_filtering_release/archive/release/kinetic/map_laser/0.0.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "980525608dc89d2251c3f18913e453f3"
SRC_URI[sha256sum] = "e6f5a290c477b8bbc4e30a13f546d20d7e7c9c3133d2e7463d912c71bffda2b8"
S = "${WORKDIR}/laser_filtering_release-release-kinetic-map_laser-0.0.4-0"

inherit catkin
