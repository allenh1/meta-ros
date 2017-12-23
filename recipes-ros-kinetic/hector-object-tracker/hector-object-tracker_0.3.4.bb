# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_object_tracker is the core package of hector_worldmodel. It listens to pe"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hector-marker-drawing hector-nav-msgs hector-worldmodel-msgs image-geometry roscpp tf"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_worldmodel-release/archive/release/kinetic/hector_object_tracker/0.3.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0d545d89d66af17d4dd013c925eb897b"
SRC_URI[sha256sum] = "ecd9277505a8ac1f834315da62eaef06597ea2762bfd4593db597517f442c793"
S = "${WORKDIR}/hector_worldmodel-release-release-kinetic-hector_object_tracker-0.3.4-0"

inherit catkin
