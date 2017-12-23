# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "URDF and meshes describing Velodyne laser scanners."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native urdf xacro"
SRC_URI = "https://github.com/DataspeedInc-release/velodyne_simulator-release/archive/release/kinetic/velodyne_description/1.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cf724a76216fd072d24fd9ac707c178a"
SRC_URI[sha256sum] = "72827c24188d741c17693501097dc15b81fbdd5569c1ef7b6baa31bf64b34575"
S = "${WORKDIR}/velodyne_simulator-release-release-kinetic-velodyne_description-1.0.6-0"

inherit catkin
