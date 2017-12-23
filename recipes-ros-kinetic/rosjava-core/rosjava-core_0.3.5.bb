# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "An implementation of ROS in pure-Java with Android support."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native geometry-msgs nav-msgs rosgraph-msgs rosjava-bootstrap rosjava-build-tools rosjava-messages rosjava-test-msgs sensor-msgs tf2-msgs"
SRC_URI = "https://github.com/rosjava-release/rosjava_core-release/archive/release/kinetic/rosjava_core/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "27e2a788c3fea5a9ee8358bfa4f4eae1"
SRC_URI[sha256sum] = "7afdae71a606f1416e599d4a6fa78895cca0296a6dd338fe5e23f60a7601c56c"
S = "${WORKDIR}/rosjava_core-release-release-kinetic-rosjava_core-0.3.5-0"

inherit catkin
