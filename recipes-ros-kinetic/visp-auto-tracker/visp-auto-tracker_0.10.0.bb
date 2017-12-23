# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Online automated pattern-based object tracker relying on visual servoing.      v"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "catkin-native geometry-msgs libdmtx-dev message-filters resource-retriever roscpp sensor-msgs std-msgs visp visp-bridge visp-tracker zbar"
SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/kinetic/visp_auto_tracker/0.10.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "36ac22f12963ac6235f36ee3d496a8e3"
SRC_URI[sha256sum] = "fb49ad259aeac43ef505b5bb02e6b0720e601ca257d59afeb7318d8f072f8c9f"
S = "${WORKDIR}/vision_visp-release-release-kinetic-visp_auto_tracker-0.10.0-0"

inherit catkin
