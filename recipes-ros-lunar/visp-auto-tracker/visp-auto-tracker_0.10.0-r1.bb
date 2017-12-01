# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Online automated pattern-based object tracker relying on visual servoing.      v"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "catkin-native geometry-msgs libdmtx-dev message-filters resource-retriever roscpp sensor-msgs std-msgs visp visp-bridge visp-tracker zbar"
SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/lunar/visp_auto_tracker/0.10.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "858340e873c59c5416ddfc7ad52ead29"
SRC_URI[sha256sum] = "e0d641be0a08f15d9e7a386451bae229fbc800bd3774fd295d81e6cfa49a04b7"
S = "${WORKDIR}/vision_visp-release-release-lunar-visp_auto_tracker-0.10.0-1"

inherit catkin
