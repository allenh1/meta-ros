# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The mrpt_map is able to publish a mrpt map as ros occupancy grid like the map_se"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native mrpt mrpt-bridge nav-msgs roscpp sensor-msgs std-msgs tf"
SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_navigation-release/archive/release/kinetic/mrpt_map/0.1.18-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c50b337c47918416daa11c02b36269e6"
SRC_URI[sha256sum] = "470bb4f840037592f2c455e844378884cee0c7087fadc9bbd23d002f02d37597"
S = "${WORKDIR}/mrpt_navigation-release-release-kinetic-mrpt_map-0.1.18-0"

inherit catkin
