# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hector_worldmodel_geotiff_plugins contains a plugin to visualize worldmodel obje"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hector-geotiff hector-worldmodel-msgs"
SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_worldmodel-release/archive/release/kinetic/hector_worldmodel_geotiff_plugins/0.3.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7933d8ab9b12fdc2513ede9b7f601e00"
SRC_URI[sha256sum] = "68aa6355f7c39c11ad20cdc7ce8129f6c4fb4bf9710105b1e76c2214395701d1"
S = "${WORKDIR}/hector_worldmodel-release-release-kinetic-hector_worldmodel_geotiff_plugins-0.3.4-0"

inherit catkin
