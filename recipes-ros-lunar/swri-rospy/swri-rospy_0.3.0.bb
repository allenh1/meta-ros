# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides added functionaliy on top of rospy, including a   single-t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin rospy std-msgs std-srvs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_rospy/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4f8f000636eecf593c745cf8ae8f87ae"
SRC_URI[sha256sum] = "9d923b2a95b7ab1833362fa288403e08c2fb4963a4c8671616f65979de8be17c"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
