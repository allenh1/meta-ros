# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Gazebo plugin to provide simulated data from Velodyne laser scanners."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gazebo-ros roscpp sensor-msgs tf"
SRC_URI = "https://github.com/DataspeedInc-release/velodyne_simulator-release/archive/release/kinetic/velodyne_gazebo_plugins/1.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7441dbea46a0a17d2cc194ca7d6c5b59"
SRC_URI[sha256sum] = "fd6ad552ddae1658a4e51a3d2d65025ddfa4610f93edc661864f71c88f0351fc"
S = "${WORKDIR}/velodyne_simulator-release-release-kinetic-velodyne_gazebo_plugins-1.0.6-0"

inherit catkin
