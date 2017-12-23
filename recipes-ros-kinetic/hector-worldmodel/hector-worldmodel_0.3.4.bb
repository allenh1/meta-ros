# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The hector_worldmodel stack helps to collect and fuse information about objects "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hector-object-tracker hector-worldmodel-geotiff-plugins hector-worldmodel-msgs"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_worldmodel-release/archive/release/kinetic/hector_worldmodel/0.3.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9686c512833583a58238cd03d98aa3de"
SRC_URI[sha256sum] = "0f6cd02aa2e36dd6b65a95f7c4f1967953968ca085f31385c6dceebae2d42717"
S = "${WORKDIR}/hector_worldmodel-release-release-kinetic-hector_worldmodel-0.3.4-0"

inherit catkin
