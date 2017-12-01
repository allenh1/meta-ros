# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common code for working with images in ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "camera-calibration-parsers camera-info-manager catkin-native image-transport polled-camera"
SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/lunar/image_common/1.11.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "db56c38a529708dd4ad2bf10c446bea3"
SRC_URI[sha256sum] = "ebdbdc1f5aba95beaf4feeffddc62fbb326036764ece2aabf289cd365c1a3c78"
S = "${WORKDIR}/image_common-release-release-lunar-image_common-1.11.12-0"

inherit catkin
