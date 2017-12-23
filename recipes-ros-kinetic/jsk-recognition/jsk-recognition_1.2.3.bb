# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native checkerboard-detector imagesift jsk-pcl-ros jsk-perception jsk-recognition-msgs jsk-recognition-utils resized-image-transport"
SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/kinetic/jsk_recognition/1.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d5ec6035d8b4f6af487765d31b0fba0f"
SRC_URI[sha256sum] = "4b1aa4206eece26d0c0aba763b8ff31f06210dc2e67cb6c54ef6eee7ce33b631"
S = "${WORKDIR}/jsk_recognition-release-release-kinetic-jsk_recognition-1.2.3-0"

inherit catkin
