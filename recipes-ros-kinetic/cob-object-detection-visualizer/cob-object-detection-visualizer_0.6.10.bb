# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The cob_object_detection_visualizer package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=46ee8693f40a89a31023e97ae17ecf19"

DEPENDS = "boost catkin-native cob-object-detection-msgs cv-bridge eigen-conversions image-transport libpcl-all-dev message-filters pcl-ros roscpp sensor-msgs visualization-msgs"
SRC_URI = "https://github.com/ipa320/cob_perception_common-release/archive/release/kinetic/cob_object_detection_visualizer/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ca901ef5928e96f3d471479dc8426ca1"
SRC_URI[sha256sum] = "70faf613c35f06aac4db21b329ee3989848107e3980c5df673f87544221f34bc"
S = "${WORKDIR}/cob_perception_common-release-release-kinetic-cob_object_detection_visualizer-0.6.10-0"

inherit catkin
