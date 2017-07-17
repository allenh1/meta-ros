# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Common code for working with images in ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=83dd7728e0d31684353333f83f162415"

DEPENDS = "camera_calibration_parsers camera_info_manager catkin image_transport polled_camera"
SRC_URI = "https://github.com/ros-gbp/image_common-release/archive/release/lunar/image_common/1.11.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "db56c38a529708dd4ad2bf10c446bea3"
SRC_URI[sha256sum] = "ebdbdc1f5aba95beaf4feeffddc62fbb326036764ece2aabf289cd365c1a3c78"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
