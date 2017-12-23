# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ library about sensor model, geometrical modeling and perception."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cython dynamic-reconfigure eigen-conversions geometry-msgs image-geometry jsk-recognition-msgs jsk-topic-tools message-generation message-runtime pcl-msgs pcl-ros python-skimage sensor-msgs std-msgs tf tf2-ros tf-conversions visualization-msgs yaml-cpp"
SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/kinetic/jsk_recognition_utils/1.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5bd1276316410b7e0f7af6f6e4de1f06"
SRC_URI[sha256sum] = "458e70ecbb11b61be43fbe610b54be10874588e1fb0f8444988465fbfab35caa"
S = "${WORKDIR}/jsk_recognition-release-release-kinetic-jsk_recognition_utils-1.2.3-0"

inherit catkin
