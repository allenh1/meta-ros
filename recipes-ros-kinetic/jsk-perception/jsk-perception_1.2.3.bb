# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS nodes and nodelets for 2-D image perception."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native cmake-modules cv-bridge dynamic-reconfigure eigen geometry-msgs git image-geometry image-transport image-view image-view2 imagesift jsk-data jsk-gui-msgs jsk-recognition-msgs jsk-recognition-utils jsk-topic-tools leveldb libcmt message-generation message-runtime mk nodelet opencv-apps openni2-launch pcl-ros posedetection-msgs python-chainer-pip python-chainercv-pip python-dlib python-fcn-pip python-h5py python-sklearn python-pyyaml robot-self-filter rosbag roscpp roseus rospack rospy rostopic rqt-gui rviz sensor-msgs sound-play std-msgs tf yaml-cpp"
SRC_URI = "https://github.com/tork-a/jsk_recognition-release/archive/release/kinetic/jsk_perception/1.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e6068b26cf634fed5350e22953d61b56"
SRC_URI[sha256sum] = "0e645edb20bb9780548eb650abfdf1eb213d169ec7b78db6e36745da599741ee"
S = "${WORKDIR}/jsk_recognition-release-release-kinetic-jsk_perception-1.2.3-0"

inherit catkin
