# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Merging multiple maps without knowledge of initial   positions of robots."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin geometry-msgs map-msgs nav-msgs opencv3 roscpp tf2-geometry-msgs"
SRC_URI = "https://github.com/hrnr/m-explore-release/archive/release/lunar/multirobot_map_merge/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "53641aca30e118428e7b9e4e4236bccd"
SRC_URI[sha256sum] = "e9405e030ba2620c16ca408ff9e8ae27f49b270d21f8800b2476113381f2f6c7"
S = "${WORKDIR}/m-explore-release-release-lunar-multirobot_map_merge-2.1.0-0"

inherit catkin
