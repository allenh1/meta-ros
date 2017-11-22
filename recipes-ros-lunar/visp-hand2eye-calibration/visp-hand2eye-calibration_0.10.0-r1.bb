# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "visp_hand2eye_calibration estimates the camera position with respect      to its"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "catkin geometry-msgs image-proc message-generation message-runtime roscpp sensor-msgs std-msgs visp visp-bridge"
SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/lunar/visp_hand2eye_calibration/0.10.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c9861f654a200d7cc08c8776163a5cb5"
SRC_URI[sha256sum] = "049a1c7885ba4342a432fd44c8f56ee5a6b23e59491feb34e0b564dc25503a69"
S = "${WORKDIR}/vision_visp-release-release-lunar-visp_hand2eye_calibration-0.10.0-1"

inherit catkin
