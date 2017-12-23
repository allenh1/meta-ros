# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Flips the image of Care-O-bots kinect in dependence of the viewing direction of "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost catkin-native cob-perception-msgs cv-bridge geometry-msgs image-transport libopencv-dev nodelet pcl-conversions pcl-ros roscpp sensor-msgs stereo-msgs tf"
SRC_URI = "https://github.com/ipa320/cob_perception_common-release/archive/release/kinetic/cob_image_flip/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e15207bc2c5f5868671831a23ecc9548"
SRC_URI[sha256sum] = "acf3fb68a6c15ead3a274c05547e166756c29825ffe40ba0ef6349f2cd9bbc8f"
S = "${WORKDIR}/cob_perception_common-release-release-kinetic-cob_image_flip-0.6.10-0"

inherit catkin
